# Copyright (c) 2012-2014 LG Electronics, Inc.

SUMMARY = "Command line utilities for the Open webOS Platform Portability Layer"
AUTHOR = "Ed Chejlava <ed.chejlava@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "nyx-lib"

PV = "1.3.0-19+git${SRCPV}"
SRCREV = "429f9cc5b4988842afbdfaaebf4087b38a6d12f4"

inherit webos_public_repo
inherit webos_cmake
inherit pkgconfig

SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/nyx/nyxcmd/*"
FILES_${PN}-dbg += "${libdir}/nyx/nyxcmd/.debug/*"

# Fix builds with new -ferpmissive set by default
SRC_URI += "file://0001-Fix-fpermissive-problems.patch"
