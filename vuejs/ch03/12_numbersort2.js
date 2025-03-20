const score = [92, 96, 26, 42, 32, 67, 53, 36, 100, 9];
console.log('before = ' + score);

score.sort(function (left, right) {
  return left - right;
});

console.log('after = ' + score);
