// while
let n = 0;
while (n < 3) {
    n++;
}

// do while
let result = '';
let i = 0;
do {
    i = i + 1;
    result = result + i;
} while (i < 5);

// for await
for await (variable of iterable) {
    statement
}
// for in
const object = { a: 1, b: 2, c: 3 };

for (const property in object) {
    console.log(`${property}: ${object[property]}`);
}
// for of
const array1 = ['a', 'b', 'c'];

for (const element of array1) {
    console.log(element);
}

// for
let str = '';

for (let i = 0; i < 9; i++) {
    str = str + i;
}