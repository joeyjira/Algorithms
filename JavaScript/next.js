let video = document.getElementsByTagName('video');
let vidLength = video[0].duration;
let next;

let findNext = function() {
  document.addEventListener('click', e => {
    next = e.target;
  })
  removeListener();
}

let removeListener = function() {
  document.removeEventListener('click', findNext, true)
}
