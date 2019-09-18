var original;

function displayResult() {
    original = document.getElementById("changeHeader").innerText;
    document.getElementById("changeHeader").innerHTML = "Have a nice day!";
    document.getElementById("reset").style.visibility = "visible";
}

function resetHeader() {
    document.getElementById("changeHeader").innerHTML = original;
    document.getElementById("reset").style.visibility = "hidden";
}