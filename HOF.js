
// function myfunc(){
//     sai();
// }
// myfunc();
// function sai(b){
//     if(b==="print"){
//         console.log("SAIPRASAD DABBE");
//     }else{
//         console.log("Nothing");
//     }
    
// }
//<------------------------------------------->
// function sai(){
//     function prasad(){
        
//         return "Saiprasad";
//     }
//     return prasad();
// }
// let x=sai();
// console.log(x);
//<------------------------------------->

// let arr = [1,2,3,4,5,6];
// function print(number,index){
//   console.log("index",index,"Number-",number);
// }
// for(let i=0;i<arr.length;i++){
//     multiply(arr[i],i);
// }

// arr.forEach(print)
// <----------------------->
// let arr = [1,2,3,4,5,6];
// arr.forEach(function(number,index){
//     console.log("Number-",number,"index",index);
// })
// <------------------------------------------>

// let arr =[
//     {name:"Sai",lastname:"dabbe"},
//     {name:"shubham",lastname:"patil"},
//     {name:"suraj",lastname:"kumar"},
//     {name:"shishir",lastname:"padhan"}
// ]
// arr.forEach(function(i){
// console.log(i['name']);
// });
// <------------------------------------->
// let arr = [1,2,3,4,5,6,7,8,9];
// let multiply = function (i,el){
//     return i*el
// }
// let a = arr.map(multiply)
// console.log(a)
// <------------------------------->
// arrow function
// let arr=[1,2,3,4,5,6,7,8,9];
// let x=arr.map((number)=>{
//     return number*number;
// })
// console.log(x)
// <------------------------------>
// arrow function
// let arr=[1,2,3,4,5,6,7,8,9];
// let x=arr.map((number)=>{
//     return number*number;
// })
// console.log(x)
// <------------------------------------------->
// let arr=[1,2,3,4,5,6,7,8,9];
// let x=arr.map((number,index)=>{
//     return number*number;
// })
// console.log(x)
// >------------------------------------------->
// let arr =[
//         {name:"Sai",lastname:"dabbe"},
//         {name:"shubham",lastname:"patil"},
//         {name:"suraj",lastname:"kumar"},
//         {name:"shishir",lastname:"padhan"}
//     ]
// let names = arr.map((index)=>{
//     return index["name"];
// }) 
// console.log(names);
// <------------------------------------------->

// let arr=[1,2,3,4,5,6,7,8,9];
// let ans = arr.filter((ele)=>{
//     return ele%2===0;
// })
// console.log(ans)
// <-------------------------------------------->
// let arr=[1,2,3];
// let sum=arr.reduce((accumulator,currentvalue)=>{
//     return accumulator+currentvalue;
// },0)
// console.log(sum)
// <----------------------------------------->
// let arr=[1,2,3];
// let sum=arr.reduce((accumulator,currentvalue)=>{
//     return ;
// },0)
// console.log(sum)
let arr=[
    {product:"mobile",price:12000},
    {product:"tv",price:22000},
    {product:"mobile",price:15000}
]
let sum=arr.reduce((total,current)=>{
    return total+current.price;
},0)
console.log(sum);
// <--------------------------------------------------->
