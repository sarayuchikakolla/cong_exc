function register() {
    alert("Registered Successfully");
}

function filterCategory(category) {
    console.log(category);
}

document.querySelector("#search")
.addEventListener("keydown", function (event) {

    console.log(event.target.value);
});