//  변수에 익명 함수 할당
const greet = () => { return "Hello!"; };
console.log(greet()); // "Hello!"
// 콜백 함수로 사용
[1, 2, 3].map((num)=> {
    return num * 2;
}); // [2, 4, 6]
// 즉시 실행 함수 표현식(IIFE)
(()=> { console.log("즉시 실행!"); })();

