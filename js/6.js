const events = [];

events.push("Music Event");
events.push("Workshop on Baking");

console.log(events);

const musicEvents = events.filter(
    event => event.includes("Music")
);

console.log(musicEvents);

const cards = events.map(
    event => `Event Card: ${event}`
);

console.log(cards);