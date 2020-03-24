import colorConverter from 'color-convert';
import { TtfHex, TtfHsl } from '../../../commons/src/model/Color';

export function convert(color: TtfHex): TtfHsl {
    const convertedColor = colorConverter.hex.hsl(color.hex);

    return {
        hue: convertedColor[0],
        saturation: convertedColor[1],
        lightness: convertedColor[2]
    } as TtfHsl;
}