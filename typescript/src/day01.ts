import {readFileSync} from 'node:fs';

export function solveDay01() {
    const instructions = readFileSync(`${__dirname}/../../input/day01/google.txt`, 'utf8');
    const results = solve(instructions);
    console.log(`Day 01, part 1: ${results[0]}`);
    console.log(`Day 01, part 2: ${results[1]}`);
}

export function solve(instructions: string): [number, number] {
    let level = 0;
    let pos = -1;
    for (const i in instructions.split('')) {
        const instruction = instructions[i];
        if (instruction === '(') {
            level++;
        } else if (instruction === ')') {
            level--;
        }
        if (level === -1 && pos === -1) {
            pos = parseInt(i, 10) + 1;
        }
    }
    return [level, pos];
}
