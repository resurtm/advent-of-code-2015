import {describe, expect, it} from '@jest/globals';
import {runSolution} from './day01';

describe('day01', () => {
    it.each([
        ['(())', 0],
        ['()()', 0],

        ['(((', 3],
        ['(()(()(', 3],

        ['))(((((', 3],

        ['())', -1],
        ['))(', -1],

        [')))', -3],
        [')())())', -3],
    ])('instructions %p, expected %p', (instructions: string, expected: number) => {
        expect(runSolution(instructions)).toEqual(expected);
    });
});
