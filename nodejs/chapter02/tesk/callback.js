const order = (name, callback) => {
  setTimeout(() => {
    console.log(`${name} 주문 접수`);
}, 3000);
callback(name);
};
const display = (result) => {
  console.log(`${result} 완료!`);
};
order('아메리카노', display);
