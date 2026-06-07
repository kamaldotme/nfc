// orig: xyz/happify/ckemv/Reporter.java
//   kept-name (loaded by System.loadLibrary, JNI binds methods by FQN)
//
// Thin JNI bridge into libckemv_reporter.so — a 3.01 MB Rust HTTPS client
// (ureq + rustls + ring + webpki, Mozilla CA bundle embedded, no pinning,
// TLS 1.3 + ECH + MLKEM768).
//
// Protocol: each method returns the response body verbatim, OR a string
// prefixed with "Error: ...". Callers grep for the literal "Success" or
// "Error" rather than parsing status codes — there's no other channel.

package xyz.happify.ckemv.jni

object Reporter {
    init { System.loadLibrary("ckemv_reporter") }

    /** GET {baseUrl}/me with Authorization: Bearer {apiKey}.
     *  Returns the JSON body (consumed by Gson as MeResponse), or "Error: ...". */
    external fun fetchCves(apiKey: String, baseUrl: String): String

    /** GET {baseUrl}/report. Has NO Java caller in this build — leftover
     *  from a panel-side feature or future operator dashboard endpoint. */
    external fun fetchReport(apiKey: String, baseUrl: String): String

    /** POST {baseUrl}/harvest with JSON body. Response contains "Success"
     *  on accept; UploadLoop / PostTapUploader watch for that substring
     *  to decide whether to delete the local rows. */
    external fun uploadHarvestData(json: String, apiKey: String, baseUrl: String): String
}
