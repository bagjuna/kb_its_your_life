let obj1 = { name: '박준아', age: 29, c: { d: 'a' } };
let obj3 = { ...obj1 }; 
let obj4 = { ...obj1, email: 'msspark@gmail.com' };

obj2 = 19;
console.log(obj1);
console.log(obj2);
console.log(obj3);
console.log(obj1 == obj2);
console.log(obj1 == obj3);

// let arr1 = [100, 200, 300];
// let arr2 = ['hello', ...arr1, 'world'];
// console.log(arr1);
// console.log(arr2);
//
// let arr3 = arr2;
// let temp = [1, 2, 2];
// arr3 = temp;
// console.log('===== 얕은 복사? ======');
//
// console.log(arr3);
// console.log(arr2);
