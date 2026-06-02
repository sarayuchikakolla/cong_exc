document.querySelector("#form")
.addEventListener("submit", function (event) {

    event.preventDefault();

    const form = event.target;

    const name = form.elements["username"].value;
    const email = form.elements["email"].value;

    if (name === "" || email === "") {

        document.querySelector("#error")
        .innerText = "All fields required";

    } else {

        alert("Form Submitted");
    }
});