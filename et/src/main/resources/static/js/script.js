document.querySelectorAll(".service").forEach(function (elem) {
    let diffRot = 0;
    let rotate = 0;
    elem.addEventListener("mouseleave", function (dets) {
        gsap.to(elem.querySelector("img"), {
            opacity: 0,
            ease: Power3,
        });
    });
    elem.addEventListener("mousemove", function (dets) {
        let diff = dets.clientY - elem.getBoundingClientRect().top;
        diffRot = dets.clientX - rotate;
        rotate = dets.clientX;

        // elem.querySelector("img").style.opacity = 1;

        //or

        gsap.to(elem.querySelector("img"), {
            opacity: 1,
            ease: Power3,
            y: diff,
            x: dets.clientX - elem.getBoundingClientRect().left,
            rotate: gsap.utils.clamp(-20, 20, diffRot),
        });
    });
});