# Sample-specific hooks

Frida hooks unique to THIS sample (e.g. native TLS-verify bypass at a
binary-specific offset, JNI bridge captures for renamed classes). The generic,
reusable hooks live in `lab/hooks/`. Load both via the driver.
