const stages = document.querySelectorAll(".toy-stage");
let activeAudio = null;

function playToy(stage) {
    stages.forEach(other => {
        if (other !== stage) other.classList.remove("playing");
    });

    stage.classList.add("playing");

    if (activeAudio) {
        activeAudio.pause();
        activeAudio.currentTime = 0;
        activeAudio = null;
    }

    // Optional local sound files can be added to the sounds folder.
    // If a sound file is absent, the animation still works.
    const soundPath = stage.dataset.sound;
    const audio = new Audio(soundPath);
    audio.volume = 0.55;
    activeAudio = audio;

    audio.play().catch(() => {
        // Browsers may block audio until the user interacts.
        // The toy animation remains available without sound.
    });
}

function stopToy(stage) {
    stage.classList.remove("playing");
    if (activeAudio) {
        activeAudio.pause();
        activeAudio.currentTime = 0;
        activeAudio = null;
    }
}

stages.forEach(stage => {
    stage.addEventListener("mouseenter", () => playToy(stage));
    stage.addEventListener("mouseleave", () => stopToy(stage));
    stage.addEventListener("focus", () => playToy(stage));
    stage.addEventListener("blur", () => stopToy(stage));
    stage.addEventListener("click", () => {
        if (stage.classList.contains("playing")) stopToy(stage);
        else playToy(stage);
    });
    stage.addEventListener("keydown", event => {
        if (event.key === "Enter" || event.key === " ") {
            event.preventDefault();
            if (stage.classList.contains("playing")) stopToy(stage);
            else playToy(stage);
        }
    });
});
