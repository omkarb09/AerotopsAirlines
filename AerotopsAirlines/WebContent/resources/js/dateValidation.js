function compare()
{
    var startDt = document.getElementById("deptd").value;
    var endDt = document.getElementById("arrvd").value;

    if((new Date(startDt).getTime() < new Date(endDt).getTime()))
    {
      window.alert("asbc");
    }
}