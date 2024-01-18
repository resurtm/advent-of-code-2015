import {readFileSync} from 'node:fs';

export function solveDay01() {
    const instructions = readFileSync(`${__dirname}/../../input/day01/google.txt`, 'utf8');
    const result = runSolution(instructions);
    console.log(`Day 01, part 1: ${result}.`);
}

export function runSolution(instructions: string): number {
    let level = 0;
    for (const instruction of instructions) {
        if (instruction === '(') {
            level++;
        }
        if (instruction === ')') {
            level--;
        }
    }
    return level;
}
