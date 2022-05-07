let b = document.querySelector('button');
b.addEventListener('click',inputit);
function inputit(){
    let a=prompt('input the name');
    b.textContent='ROLL NUMBER 1:' + a;
}