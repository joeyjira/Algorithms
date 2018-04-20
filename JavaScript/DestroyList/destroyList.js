function destroyList(ul) {
  let list = document.getElementById('listToDestroy')
  list.innerHTML = "";
}

document.getElementById('listToDestroy').addEventListener('click', e => {
  e.preventDefault();
  console.log(e.target.parentNode);
  let el = e.target.parentNode;
  el.parentNode.removeChild(el);
})
