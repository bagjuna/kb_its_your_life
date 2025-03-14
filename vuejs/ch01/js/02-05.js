function addContact(name, phoneNumber, tel = '', city = '') {
    console.log(`name: ${name}, phoneNumber: ${phoneNumber}, tel: ${tel}, city: ${city} `);
}

addContact("홍길동", "010-222-3331")
addContact("이몽룡", "010-222-3331", "02-3422-9900", "서울시");