document.querySelector("#form")
.addEventListener("submit", function (event) {

    event.preventDefault();

    console.log("Form Submitted");

    const name =
        document.querySelector("#name").value;

    console.log("User Name:", name);

    debugger;

    fetch("https://jsonplaceholder.typicode.com/posts", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify({ name: name })
    })

    .then(response => response.json())

    .then(data => {

        console.log("Success");
        console.log(data);
    })

    .catch(error => {

        console.log("Error");
        console.log(error);
    });
});