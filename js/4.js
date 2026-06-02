function addEvent(name) {
    console.log(`${name} added`);
}

function registerUser(user) {
    console.log(`${user} registered`);
}

function filterEventsByCategory(events, callback) {
    return events.filter(callback);
}

function registrationCounter() {

    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const counter = registrationCounter();

console.log(counter());
console.log(counter());

const events = [
    { name: "Music Fest", category: "Music" },
    { name: "Cooking Workshop", category: "Workshop" }
];

const musicEvents = filterEventsByCategory(
    events,
    event => event.category === "Music"
);

console.log(musicEvents);