let doubleHolder = document.getElementById('doubleHolder');

doubleHolder.addEventListener('click', e => {
  e.preventDefault;
  let parent = e.target.parentNode;
  parent.removeChild(e.target);

  var button1 = document.createElement('button');
  button1.innerHTML = "Hello";
  var button2 = document.createElement('button');
  button2.innerHTML = "Bye";
  parent.appendChild(button1);
  parent.appendChild(button2);
})

doubleHolder.addEventListener('click', e => {
  if (e.target.classList.contains('double')) {
    let btn = document.createElement('button');
    btn.setAttribute('class', 'double');
    btn.innerHTML = 'double';

    let btn2 = document.createElement('button');
    btn2.setAttribute('class', 'double');
    btn2.innerHTML = 'double';

    this.appendChild(btn);
    this.appendChild(btn2);
    this.removeChild(e.target);
  }
})
