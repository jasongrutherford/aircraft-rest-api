/**
 * Javascript/jQuery code to call the REST API call and to populate the table upon page load.
 *
 * Author: Jason Rutherford
 * Date: 22/09/2018
 */

/*
 * To be called once the DOM has successfully loaded in the browser.
 */
$( document ).ready(function() {

  $.ajax({
    url: '/api/1.0/aircraft',
    type: 'GET',
    success: function(data) {

      if (data.length > 0) {
        var table = document.createElement("table");
        table.className = "table";
        table.appendChild(createHeadings(data[0]));

        $.map(data, function(c, i) {
          table.appendChild(createRow(c, i));
        });
        document.getElementById("data-set").appendChild(table);
      } else {
        document.getElementById("data-set").
            appendChild(
                createMessageDiv("No data available", "alert alert-warning"));
      }

    },
    error: function(data) {
      document.getElementById("data-set").
          appendChild(
              createMessageDiv("The REST API Call failed to execute properly", "alert alert-danger"));
    }
  });
});

/**
 * Helper function to make it a bit easier to print warnings/errors.
 *
 * @param msg The message to appear in the div.
 * @param className The names of the CSS classes to apply styling to the div.
 * @returns {HTMLElement} <DIV>
 */
function createMessageDiv(msg, className) {
  var div = document.createElement("div");
  div.innerText = msg;
  div.className = className;
  return div;
}

/**
 * Function to create the table headings.  Returns a <THEAD> element with children
 * elements.
 *
 * @param obj A JSON object which will be used to extract the column headings from.
 * @returns {HTMLElement} <THEAD>
 */
function createHeadings(obj)  {
  var tableHeader = document.createElement('thead');
  var theadRow = document.createElement('tr');

  var heading = document.createElement('th');
  heading.innerText = "#";
  theadRow.appendChild(heading);

  for (var key in obj) {
    var heading = document.createElement('th');
    heading.innerText = key;
    theadRow.appendChild(heading);
  }

  tableHeader.appendChild(theadRow);
  return tableHeader;
}

/**
 * Function to create a data row in the data table.  The row will have
 * child <TD> appended to it.
 *
 * @param obj JSON Object holding a single row of data.
 * @param index The position of the JSON Object in the array returned by the REST call.
 * @returns {HTMLElement}
 */
function createRow(obj, index)  {

  var dataRow = document.createElement('tr');
  dataRow.id = "row-" + index;

  var rowElement = document.createElement('td');
  rowElement.id = "row-number-" + index;
  rowElement.innerText = index + 1;
  dataRow.appendChild(rowElement);

  for (var key in obj) {
    var rowElement = document.createElement('td');
    rowElement.id = key + " " + index;
    rowElement.innerText = obj[key];
    dataRow.appendChild(rowElement);
  }

  return dataRow;
}