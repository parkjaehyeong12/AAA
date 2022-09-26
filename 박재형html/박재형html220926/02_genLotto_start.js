function genLotto(startnum) {
    startnum=Number(startnum)
    let lotto = [startnum]
    //startnum이 첫번째로 들어가고
    //그 뒤에 들어가는 숫자는 무조건 그보다 커야한다.

    //확실하게 '숫자'로 형변환해주는것

    for (let i = 1; i < 6; i++) {
    let num = Math.floor(Math.random() * 45) + 1

    //난수생성, 중복제거코드 더 심플, indexOf
    //indexOf: 해당값이 배열 안 어디에 있는지 표시
    //만약 배열이[10,20,30]인데 indexOf[20] 하면 숫자 1을 반환
    //만약 없으면 -1을 반환
    //lotto.indexOf(num)!=-1의 의미
    //num값이 로또배열 안에 있기는 하다는 의미

        if(lotto.indexOf(num)!=-1 ||num<startnum){
            i--
            continue
        }
        // if(num<startnum)
        // {
        //     i--
        //     continue
        // }
        lotto[i]=num
    }
    

    //정렬코드(버블)
    //sort는 함수를 매개변수로 하는 함수.
    //즉 콜백함수
    //sort안에 들어가는 함수를 이요해서 배열정렬
    //매개변수 a와 b는 배열 안에 있는 값
    //두 개의 값을 서로 비교해서 음수,0,양수
    //뭐가 나오냐에 따라서 정렬이 달라짐
    //a,b 대신에, x,y등을 넣어도 된다.

    lotto.sort(function(a,b)
    {return a-b;})

    return lotto
}