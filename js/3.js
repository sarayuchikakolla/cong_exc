const events = [
    { name: "Music Fest", seats: 10, valid: true },
    { name: "Dance Show", seats: 0, valid: true },
    { name: "Old Event", seats: 5, valid: false }
];

events.forEach(event => {

    if (event.valid && event.seats > 0) {
        console.log(event.name);
    }
});

try {

    let seats = 0;

    if (seats <= 0) {
        throw "No seats available";
    }

} catch (error) {

    console.log(error);
}