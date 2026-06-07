package z2;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import m0.z;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f5363m;

    public u(Socket socket) {
        this.f5363m = socket;
    }

    @Override // z2.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // z2.e
    public final void k() {
        Socket socket = this.f5363m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!z.O(e3)) {
                throw e3;
            }
            m.f5349a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e4) {
            m.f5349a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        }
    }
}
