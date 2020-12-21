using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace AgeCalculatorService_2
{
   
    [ServiceContract]
    public interface IService1
    {

        [OperationContract]
        int calculateDays(int day, int Month, int year);

        

        // TODO: Add your service operations here
    }


    
}
