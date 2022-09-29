window.onload = () =>{
    const name = document.querySelector('#name')
    const gender = document.querySelector('#gender')
    const beonho = document.querySelector('#beonho')
    
    const print = document.querySelector('#print')
    const reset = document.querySelector('#reset')

    const printOrderBy= document.querySelector('#printOrderby')
    const information = document.querySelector('#information')

    function resetInfo() {      
        information.innerHTML='' 
    }

    reset.addEventListener('click',function(){
        resetInfo()
        students=[]
    })

    print.addEventListener('click',function(){
        const student = new Student(name.ariaValueMax, gender.ariaValueMax,
            Number(beonho.value))
            let newStuentInfo = $('<h1></h1>')
            newStuentInfo.innerHTML= student.toString()
            if(student.gender=='남')
            {
                newStuentInfo
                .style.backgroundcolor='springgreen'
                newStuentInfo
                .style.backgroundcolor='blue'
            } else {
                newStuentInfo
                .style.backgroundcolor='balck'
                newStuentInfo
                .style.color='pink'
            }
            information.appendChild(newStuentInfo)
    })
}