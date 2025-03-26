function Student(name, korean, math, english, science) {
    this.name = name;
    this.korean = korean;
    this.math = math;
    this.english = english;
    this.science = science;
    this.getSum = function() {
        return this.korean + this.math + this.english + this.science;
    }
    this.getAverage = function() {
        return this.getSum() / 4;
    }
    this.toString = function() {
        return `${this.name}\t${this.getSum()}\t${this.getAverage()}`;
    }
}
let students = [];
students.push(new Student('윤인성', 90, 83, 76, 89));
students.push(new Student('박찬호', 90, 83, 76, 89));
students.push(new Student('류현진', 90, 83, 76, 89));
students.push(new Student('이세돌', 90, 83, 76, 89));
students.push(new Student('김세진', 90, 83, 76, 89));
students.push(new Student('이하나', 90, 83, 76, 89));
let output ='name\t총점\t평균\n';
for(let i in students) {
    output += students[i].toString()+ '\n';
}
console.log(output);