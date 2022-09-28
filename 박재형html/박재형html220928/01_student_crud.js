function Student(name, age, number) {
    this.name = name
    this.age = age
    this.number = number
}
//애로우 펀션은 this가 안된다.
Student.prototype.regist = function () {
    alert(this.number + '번 ' + this.name + '학생 등록 완료')
}

Student.prototype.toString = function () {
    return this.name + ' ' + this.number + ' ' + this.age
}

window.onload = () => {
    let my_name = document.querySelector('#name')
    let my_age = document.querySelector('#age')
    let my_num = document.querySelector('#num')

    let my_create = document.querySelector('#create')
    let my_read = document.querySelector('#read')
    let my_update = document.querySelector('#update')
    let my_delete = document.querySelector('#delete')

    let my_console_log = document.querySelector('#console_log')


    let my_students = []

    my_create.onclick = function () {
        for (const iterator of my_students) {
            if (iterator.number == my_num.value) {
                alert('중복 학생 존재')
                return
            }
        }
        let tempStudent = new Student(my_name.value,
            my_age.value, my_num.value)
        my_students.push(tempStudent)
        tempStudent.regist()
        // console.log(my_students.toString())
        console.log(my_students.toString())
    }

    function findStudent() {
        //객체면 findIndex , 배열이면 indexOf
        //findIndex: 객체형태의 배열에서 특정 조건에 맞는 객체가 몇 번에 있는지 찾기
        //ex)my_num에 적힌 값이랑 number값이 같은 거 찾기

        //indexOf: 숫자나 문자열 형태의 배열에서 찾고자 하는 값의 위치(=인덱스) 찾음
        //공통점:찾고자 하는 값이 없을때 -1을 반환

        const idx = my_students.findIndex(
            function (item) {
                return item.number == my_num.value
            }
        )
        if (idx != -1) {
            alert(`${my_students[idx].number}번 학생은 ${my_students[idx].name}`)
        }
    }

    my_read.onclick = findStudent

    my_update.addEventListener('click', () => {
        const idx = my_students.findIndex(
            function (item) {
                return item.number == my_num.value
            }
        )
        if (idx != -1) {
            my_students[idx].name = my_name.value
            my_students[idx].age = my_age.value
        }
    })

    my_delete.addEventListener('click', function () {
        for (let i = 0; i < my_students.length; i++)
        {
            if (my_num.value == my_students[i].number)
            {
                my_students.splice(i, 1)
                alert('학생 삭제 완료')
                return
            }
        }
        alert('해당 번호의 학생 없음')
    })

    let allSelect = function(){
        for (const iterator of my_students) {
            console.log(iterator.toString())
        }
    }
    
    my_console_log.addEventListener('click',allSelect)

}
