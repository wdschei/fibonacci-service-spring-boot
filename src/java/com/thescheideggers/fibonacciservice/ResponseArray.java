/*
 * Copyright (c) 2014 Test Inc.
 * All rights reserved.
 *
 * This distribution may include materials developed by third parties.
 */
package com.thescheideggers.fibonacciservice;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * This is the ResponseArray object.
 * Since JAX-RS supports automatic mapping from a JAXB annotated class to XML and JSON,
 * some of the magic is already taken care of.</p>
 * <p>
 * Copyright: Copyright (c) 2014</p>
 * <p>
 * Company: Test Inc.</p>
 * <p/>
 * @author <a href="mailto:William.Scheidegger@GMail.com?subject=ResponseArray%20JavaDoc">William Scheidegger</a>
 */
@XmlRootElement
public class ResponseArray
{
   private long[] value;

   /**
    * Public no-arg constructor to initialize the "Value" at a minimum.
    */
   public ResponseArray()
   {
      value = new long[0];
   }

   /**
    * Constructs a new Response with the specified "Value".
    * <p/>
    * @param aL the initial value
    */
   public ResponseArray(final long[] aL)
   {
      value = aL;
   }

   /**
    * Returns the "Value" of this Response.
    * <p/>
    * @return the "Value" of this Response
    */
   public long[] getValue()
   {
      final long[] rtn;
      if(value == null || value.length == 0)
      {
         rtn = new long[0];
      }
      else
      {
         rtn = new long[value.length];
         System.arraycopy(value, 0, rtn, 0, rtn.length);
      }
      return rtn;
   }

   /**
    * Sets the "Value" of this Response.
    * <p/>
    * @param aL the new "Value"
    */
   public void setValue(final long[] aL)
   {
      if(aL == null || aL.length == 0)
      {
         value = new long[0];
      }
      else
      {
         value = new long[aL.length];
         System.arraycopy(aL, 0, value, 0, value.length);
      }
   }
}
