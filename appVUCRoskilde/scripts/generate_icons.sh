#!/bin/bash

DIR=`dirname $0`

convert ${DIR}/../res/drawable/vucroskilde_logo_simple_square.png -resize 36x36 ${DIR}/../res/drawable-ldpi/icon_logo.png
convert ${DIR}/../res/drawable/vucroskilde_logo_simple_square.png -resize 48x48 ${DIR}/../res/drawable-mdpi/icon_logo.png
convert ${DIR}/../res/drawable/vucroskilde_logo_simple_square.png -resize 72x72 ${DIR}/../res/drawable-hdpi/icon_logo.png
convert ${DIR}/../res/drawable/vucroskilde_logo_simple_square.png -resize 96x96 ${DIR}/../res/drawable-xhdpi/icon_logo.png

read -p "Hit RETURN" dummy
