
function clickfunction(name){
console.log(name)
var t = document.getElementById("sel_stud")
t.value = name
}

function checkbound(bound,objectname) {
   
  }

// var create_button = document.querySelector('input[value="Create"]')

// //Event for submit new student grade
// create_button.addEventListener('click',function(evt){
//     evt.preventDefault()
//     var name = document.getElementById("name")
//     var height = document.getElementById("height")
//     var weight = document.getElementById("weight")
//     var gpa = document.getElementById("gpa")

//     //Check GPA
//     if (!isNaN(gpa.value) && !isNaN(parseFloat(gpa.value))){//check numeric
//         if (gpa.value>4.33) {//check input > Max
//             window.alert("GPA greater than 4.33. Please input a valid number")
//             return false
//         } else {
//             if (gpa.value<0){//Check input < lower bound of F
//                 window.alert("GPA less than 0. Please input a valid number")
//                 return false
//             } else {//Update grades and refresh histogram

//             }
//         }
//     } else {
//         window.alert("Non numeric GPA "+gpa.value+". Please input a valid number")
//         return false
//     }

//     //Check weight        
//     if (!isNaN(weight.value) && !isNaN(parseFloat(weight.value))){//check numeric
//             if (weight.value<0){//Check input < lower bound of F
//                 window.alert("GPA less than 0. Please input a valid number")
//                 return false
//             } else {//Update grades and refresh histogram
//                 if (!Number.isInteger(Number(weight.value))){
//                     window.alert("Non integer number "+weight.value+". Please input an integer")
//                     return false
//                 }
//             }
//         }
//      else {
//         window.alert("Non numeric weight "+weight.value+". Please input a valid number")
//         return false
//     }
//     return true
// })

function validateForm() {

    var name = document.getElementById("name")
    if (name.value == "") {
      alert("Name must be filled out");
      return false;
    }

        //Check GPA
    var gpa = document.getElementById("gpa")
    if (!isNaN(gpa.value) && !isNaN(parseFloat(gpa.value))){//check numeric
        if (gpa.value>4.33) {//check input > Max
            window.alert("GPA greater than 4.33. Please input a valid number")
            return false
        } else {
            if (gpa.value<0){//Check input < lower bound of F
                window.alert("GPA less than 0. Please input a valid number")
                return false
            } else {//Update grades and refresh histogram

            }
        }
    } else {
        window.alert("Non numeric GPA "+gpa.value+". Please input a valid number")
        return false
    }

        //Check weight        
    var weight = document.getElementById("weight")
    if (!isNaN(weight.value) && !isNaN(parseFloat(weight.value))){//check numeric
            if (weight.value<0){//Check input < lower bound of F
                window.alert("Weight less than 0. Please input a valid number")
                return false
            } else {//Update grades and refresh histogram
                if (!Number.isInteger(Number(weight.value))){
                    window.alert("Non integer number "+weight.value+". Please input an integer")
                    return false
                }
            }
        }
     else {
        window.alert("Non numeric weight "+weight.value+". Please input a valid number")
        return false
    }

    //Check height    
    var height = document.getElementById("height")    
    if (!isNaN(height.value) && !isNaN(parseFloat(height.value))){//check numeric
        if (height.value<0){//Check input < lower bound of F
            window.alert("Height less than 0. Please input a valid number")
                return false
            } else {//Update grades and refresh histogram
                if (!Number.isInteger(Number(height.value))){
                    window.alert("Non integer number "+height.value+". Please input an integer")
                    return false
                }
            }
        }
    else {
        window.alert("Non numeric height "+height.value+". Please input a valid number")
        return false
    }
}

  
