const events = [
    { name: "Music Fest", date: "10 June" }
];

function showEvent(eventName = "Default Event") {
    console.log(eventName);
}

showEvent();

const { name, date } = events[0];

console.log(name);
console.log(date);

const copiedEvents = [...events];

console.log(copiedEvents);