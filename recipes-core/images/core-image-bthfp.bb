# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
        kernel-modules \
	kernel-devicetree \
	linux-firmware \
	udev \
	"

IMAGE_INSTALL += " \
	alsa-utils \
	bluez5 \
	bluez5-testtools \
	bluez5-obex \
	pulseaudio-server \
	pulseaudio-misc \
	pulseaudio-module-bluez5-device \
	pulseaudio-module-bluez5-discover \
	pulseaudio-module-bluetooth-discover \
	pulseaudio-module-bluetooth-policy \
	pulseaudio-module-switch-on-connect \
	pulseaudio-module-echo-cancel \
	pulseaudio-module-loopback \
	ofono \
	ofono-tests \
	usbutils \
	"

IMAGE_FEATURES += "ssh-server-dropbear"
