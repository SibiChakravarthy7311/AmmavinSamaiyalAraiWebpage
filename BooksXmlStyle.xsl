<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
    <head>
    <style>
      h1{text-align:center;text-color:#7c7cc1;}
      table{border-collapse:collapse;width:40%;}
      table th,td{border:1px solid green;padding:3px;}
    </style>
  </head>
<body>
  <h2>Book Catalogue</h2>
  <table>
    <tr bgcolor="blue" style="border:1px solid black;color:white">
      <th style="text-align:center ">TITLE</th>
      <th style="text-align:center ">ISBN_NO</th>
      <th style="text-align:center ">AUTHOR</th>
      <th style="text-align:center ">PUBLISHER</th>
      <th style="text-align:center ">PRICE</th>        
    </tr>
    <xsl:for-each select="books/book">
    <tr style="border:1px solid black" >
      <td style="text-align:center"><xsl:value-of select="TITLE"/></td>
      <td style="text-align:center"><xsl:value-of select="ISBN_NO"/></td>
      <td style="text-align:center"><xsl:value-of select="AUTHOR"/></td>
    <td style="text-align:center"><xsl:value-of select="PUBLISHER"/></td>
      <td style="text-align:center"><xsl:value-of select="PRICE"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>


<!-- TITLE,ISBN_NO,AUTHOR,PUBLISHER,PRICE -->