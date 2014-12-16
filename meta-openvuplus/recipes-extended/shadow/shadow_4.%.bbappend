PR .= "-vuplus1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

# remove passwd login
ALTERNATIVE_PRIORITY[login] = "10"

