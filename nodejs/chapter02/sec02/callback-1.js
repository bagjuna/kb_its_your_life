const order = (coffee, callbak) => {
  console.log(`${coffee} 주문 접수`);
  setTimeout(() => {
    callbak(coffee);
  }, 3000);
};

const display = (result) => {
  console.log(`${result} 완료`);
};

order('아메리카노', display);
