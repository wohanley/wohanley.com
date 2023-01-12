<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" encoding="utf-8" indent="yes"/>

  <xsl:template match="node()|@*">
    <xsl:copy>
      <xsl:apply-templates select="node()|@*"/>
    </xsl:copy>
  </xsl:template>

  <xsl:template match="html">
    <html>
      <xsl:attribute name="lang">en</xsl:attribute>
      <xsl:apply-templates select="node()|@*"/>
    </html>
  </xsl:template>
</xsl:stylesheet>
