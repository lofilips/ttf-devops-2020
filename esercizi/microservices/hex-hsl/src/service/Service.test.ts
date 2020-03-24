import chai from 'chai';
import {convert} from './Service';
import { hex2hslTestData } from '../../../commons/src/test-data/colors';

chai.config.includeStack = true;
const should = chai.should();

describe('test suite description', () => {
    hex2hslTestData.forEach((test) => {
        it(`test case description`, () => {
            convert(test.hexValue).should.deep.equal(test.hslValue);
        });
    });
});
