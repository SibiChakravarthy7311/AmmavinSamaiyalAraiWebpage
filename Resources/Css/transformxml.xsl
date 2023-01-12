<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
    <head>
    <style>
      h1{text-align:center;text-color:green;}
      table{border-collapse:collapse;width:40%;}
      table th,td{border:1px solid green;padding:2px;}
    </style>
  </head>
<body>
  <h2>My User Collection</h2>
  <table>
    <tr bgcolor="blue" style="border:1px solid black;color:white">
      <th style="text-align:center ">name</th>
      <th style="text-align:center ">email</th>
      <th style="text-align:center ">ph.no</th>
    </tr>
    <xsl:for-each select="signupDetails/user">
    <tr style="border:1px solid black" >
      <td style="text-align:center"><xsl:value-of select="fullname"/></td>
      <td style="text-align:center"><xsl:value-of select="Email"/></td>
      <td style="text-align:center"><xsl:value-of select="ph.no"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>

