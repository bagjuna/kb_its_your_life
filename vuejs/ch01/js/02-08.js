function addContract1({name, phone, email = "이메일없음", age = 0}) {
    console.log(name, phone, email, age)
}

addContract1({name: "이몽룡", phone: "010-1234-1234"})

function addContact2(contract) {
    if (!contract.email) contract.email = "이메일없음";
    if (!contract.age) contract.age = 0;
    let {name, phone, email, age} = contract;
    console.log(name, phone, email, age);
}
addContact2({ name : "이몽룡", phone : "010-3434-8989" })

function addContact3(name,phone,email="이메일없음",age=0) {
    console.log(name,phone,email,age);
}
addContact3("이몽룡","010-3434-8989")