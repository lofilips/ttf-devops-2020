import colorConverter from 'color-convert';
import { TtfRgb, TtfHex } from '../../../commons/src/model/Color';

export function convert(color: TtfRgb): TtfHex {
    const red = color.red;
    const green = color.green;
    const blue = color.blue;

    return { 
        hex: colorConverter.rgb.hex([red, green, blue]) 
    } as TtfHex;
}