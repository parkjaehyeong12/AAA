window.addEventListener('load',
    function() {
        const sounds = document.querySelectorAll('audio') 
        const pads = document.querySelectorAll('.pads div') 
        const visual = document.querySelector('.visual')
        const title = document.querySelector('.title')
        
        const colors = ['red','orange','yellow','green',
                        'blue','plum']
        
        // sounds.each(function(index,soundFile) {
        //     soundFile.onended = function() {
        //         visual.text('')
        //         title.text('')
        //     }
        // })
        sounds.forEach(
            function(soundFile){
                soundFile.onended=function(){
                    visual.innerHTML=''
                    title.innerHTML=''
                    // textContent로 해도 되나.
                }
            }
        )
        // pads.each(function(index,pad) {
            
        //     $(pad).on('click', function() {

                
        //         sounds.each(function(index,soundFile){
        //             soundFile.pause()
        //         })
                
        //         if(sounds[index]) {
                    
        //             sounds[index].currentTime=0
        //             sounds[index].play()
                    
                    
        //             const strArray = 
        //             sounds[index].src.split('sound/')
                    

        //             // title.text(strArray[1])
        //             title.text(strArray[1].split('.')[0])

        //             //strArray[0]은 뭔지 확인해보기
        //         }

        //         createBubbles(index)

        //     })
        // })

            pads.forEach(function(pad,index){
                pad.addEventListener('click',function(){
                    sounds.forEach(function(inx){
                        inx.pause()
                    })
                    if(sounds[index])
                    {
                        sounds[index].currentTime=0
                        sounds[index].play()
                        const strArray =
                        sounds[index].src.split('sound/')
                        title.innerHTML=strArray[1].split('.')[0]
                    }
                    createBubbles(index)
                })
            })


        const createBubbles = function(index) {
            // visual.text('')
            visual.innerHTML=''
            //css에서 적용될 div태그

            // const bubble = $('<div></div>')
            
            const bubble = document.createElement('div')
            visual.appendChild(bubble)
            bubble.style.backgroundColor=colors[index]
            bubble.style.top='300px'
            // .css('animation', 
            // 'animation 2000ms linear infinite both')
            bubble.style.animation
            ='animation 2000ms linear infinite both'
            
        }
    }
)