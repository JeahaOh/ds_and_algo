function solution(seoul) {
  //return `김서방은 ${seoul.indexOf('Kim')}에 있다`;

  var limit = seoul.length;
  for (var i = 0; i < limit; i++) {
    if ("Kim" === seoul[i]) {
      return `김서방은 ${i}에 있다`;
    }
  }

}