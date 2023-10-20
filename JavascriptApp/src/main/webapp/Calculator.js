/* Calculation Function*/
function performCalculation(){
		let x =parseInt(document.getElementById("operand1").value);
		let y = parseInt(document.getElementById("operand2").value);
		if(isNaN(x)||isNaN(y)){
			alert("Operand fields are empty");
			setFocus();
		}
		else{
		let z=document.getElementById("operator").value
		let r =0;
		switch(z){
			case "+":r=x+y;break;
			case "-":r=x-y;break;
			case "x":r=x*y;break;
			case "/":r=x/y;break;
			default: alert("wrong math operator");
			}
		}
		document.getElementById("result").value=r;
	}
	/* fousing to 1st textfield at loading of window*/ 
	function setFocus(){
		document.getElementById("operand1").focus();
	}
	
	function clearAll(){
		document.getElementById("calculatorForm").reset();
		setFocus();
	}
	function checkNumber(obj){
		let x=obj.value;
		while(isNaN(x)){
			x=prompt("Enter a whole number");
					}
		obj.value=x;
	}