function Event(name, seats) {

    this.name = name;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {

    if (this.seats > 0) {
        console.log("Seats Available");
    } else {
        console.log("No Seats");
    }
};

const event1 = new Event("Music Fest", 20);

event1.checkAvailability();

console.log(Object.entries(event1));