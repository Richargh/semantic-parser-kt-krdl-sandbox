/*
    Tick
    Trick
    Track
*/
class Temp {
    boo(){

    }
}

function OldSchool(){

}

OldSchool.prototype.boo = function (){

};

function foo(x){
    let foo = 4;
    if(foo){
        noop();
        noop();
    }else if(foo) {
        nesting();
    }else if(foo) {
        nesting();
    } else {
        return "jo!";
    }
    // Js comment
    let str = `
        Tick
        Trick
        Track
    `;

    let swotch = {
        1:'a',
        2:'e',
        3:'i',
        4:'o',
        5:'u'
    }
    for(let i = 0; i < 5; i++){
        handle(i);
    }
}

function noop(){
    "";
}

function nesting(){
    function nested(){
        const noop = () => { ""; };
    }
    console.log("hi");
}

function handle(num){
    console.log("hi");
}

console.log("hi");

// new stuff