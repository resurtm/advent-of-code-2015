import {describe, expect, it} from '@jest/globals';
import {solve} from './day01';

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
    ])('part 1: instructions %p, expected %p', (instructions: string, expected: number) => {
        expect(solve(instructions)[0]).toEqual(expected);
    });

    it.each([
        [')', 1],
        ['()())', 5],
    ])('part 2: instructions %p, expected %p', (instructions: string, expected: number) => {
        expect(solve(instructions)[1]).toEqual(expected);
    });
});
