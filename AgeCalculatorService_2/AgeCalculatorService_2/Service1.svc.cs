using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace AgeCalculatorService_2
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    public class CalculateAge : IService1
    {

        public int calculateDays(int day, int Month, int year)
        {
            DateTime dt = new DateTime(year, Month, day);
            int datetodays = DateTime.Now.Subtract(dt).Days;
            return datetodays;
        }
    }
}